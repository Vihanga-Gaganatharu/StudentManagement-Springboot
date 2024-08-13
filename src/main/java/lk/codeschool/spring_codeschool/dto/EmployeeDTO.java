package lk.codeschool.spring_codeschool.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {
    private String id;
    private String name;
    private int age;
    private String email;
}
