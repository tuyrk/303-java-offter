package com.tuyrk.throwable;

import java.io.FileNotFoundException;

/**
 * User: 涂元坤
 * Mail: 766564616@qq.com
 * Create: 2019/3/21 21:10 星期四
 * Description:
 */
public class ErrorAndException {
    private void throwError() {
        throw new StackOverflowError();
    }

    private void throwRuntimeException() {
        throw new RuntimeException();
    }

    private void throwCkeckedExceptoin() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void throwsCkeckedExceptoin() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        ErrorAndException eae = new ErrorAndException();
        try {
            eae.throwError();
        } finally {
            System.out.println("finally");
        }
        eae.throwRuntimeException();
        eae.throwRuntimeException();
        try {
            eae.throwsCkeckedExceptoin();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}