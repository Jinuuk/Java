package com.kh.exam1;

public class Book {
    //멤버

    //멤버 필드
    //인스턴스 멤버 필드 : 인스턴스별로 가져갈 속성 정의
    String title;
    //정적 멤버 필드 : 인스턴스간에 공유할 속성 정의
    static int bookId;

    public Book(String title) {
        super();
        this.title = title;
    }


    //멤버 메소드
    //인스턴스 멤버 메소드
    //인스턴스 메소드 바디에 인스턴스 멤버, 정적 멤버 모두 사용 가능
    public String getTitle() { //인스턴스 메소드
        return title;          //인스턴스 필드
    }

    public int getBookId() { //인스턴스 메소드
        return bookId;       //정적 필드
    }

    //정적 멤버 메소드 :
    //정적 멤버 메소드 바디에 정적 멤버만 사용 가능

//실행 불가 : 정적 메소드를 만든 시점에서 인스턴스 필드는 없기 때문
//    public static String getBookId2() { //정적 메소드
//        return title;                   //인스턴스 필드
//    }

    public static int getBookId2() { //정적 메소드
        return bookId;               //정적 필드
    }
}
