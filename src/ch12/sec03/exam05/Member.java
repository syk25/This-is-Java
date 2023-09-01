package ch12.sec03.exam05;


import lombok.*;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Member {

    private final String id;
    @NonNull
    private String name;
    private int age;

}
