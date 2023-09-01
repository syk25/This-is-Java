package ch12.sec03.exam01;

public class Member {
    public String id;
    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) { // 동등비교를 위해 Object의 메서드인 equals를 재정의
        if(obj instanceof Member target){ // 같은 클래스타입인지 확인
            if(id.equals(target.id)){ // 같은 아이디를 가지는지 확인
                return true;
            }
        }
        return false;
    }
}
