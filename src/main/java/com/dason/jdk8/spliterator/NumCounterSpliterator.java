package com.dason.jdk8.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 这个demo的地址 ：http://ifeve.com/java8-stream-%E4%B8%ADspliterator%E7%9A%84%E4%BD%BF%E7%94%A8%E4%B8%80/
 *
 */
public class NumCounterSpliterator implements Spliterator<Character> {

    private String str;
    private int currentChar = 0;
    private boolean canSplit = true;

    /**
     * 构造方法
     */
    public NumCounterSpliterator(int currentChar,String str,boolean canSplit) {
        this.str = str;
        this.currentChar = currentChar;
        this.canSplit = canSplit;
    }

    /**
     * 从头遍历数据流的方法
     */
    public void forEachRemaining(Consumer<? super Character> action) {
        do {
        } while (tryAdvance(action));
    }

    /**
     * 遍历方法
     */
    @Override
    public boolean tryAdvance(Consumer<? super Character> action) {
        if(str.equals("")){
            return false;
        }
        action.accept(str.charAt(currentChar++));
        return currentChar < str.length();
    }

    /**
     *  自己定义的分割方法，这里确定根据什么进行分割
     */
    @Override
    public Spliterator <Character> trySplit() {
        int i = currentChar;
        for(;canSplit && i < str.length(); ++i){
            //第一个不是数字的pos，进行分割
            if(!Character.isDigit(str.charAt(i))){
                String str1 = str;
                this.str = str1.substring(currentChar, i);
                canSplit = false;
                if(i + 1 < str1.length()){
                    return new NumCounterSpliterator(0,str1.substring(i+1, str1.length()),true);
                }else{
                    return null;
                }
            }
        }

        canSplit = false;
        return null;
    }

    /**
     *  计算总数的方法
     */
    @Override
    public long estimateSize() {
        return str.length() - currentChar;
    }

    /**
     * 这个分割迭代器有什么特性
     */
    @Override
    public int characteristics() {
        return ORDERED | SIZED | SUBSIZED | NONNULL | IMMUTABLE;
    }
}

