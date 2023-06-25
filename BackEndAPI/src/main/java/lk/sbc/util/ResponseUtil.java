package lk.sbc.util;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ResponseUtil {

    private String code;
    private String message;
    private Object data;
}
