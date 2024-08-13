package lk.codeschool.spring_codeschool.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeDTO {
    private int id;
    private String name;
    private int age;
    private String email;
}
