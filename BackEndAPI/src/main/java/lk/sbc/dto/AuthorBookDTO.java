package lk.sbc.dto;

import lk.sbc.entity.Author;
import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AuthorBookDTO {

    private String title;
    private String isbn;
    private double price;

    private ArrayList<AuthorDTO> authorList;
}
