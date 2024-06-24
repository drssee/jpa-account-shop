package namhyun.account_book.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import namhyun.account_book.domain.Member;
import namhyun.account_book.enums.SendType;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendDto extends BaseDto {

    private Long id;
    private LocalDateTime estimatedSendTime;
    private SendType sendType;
    private boolean isSend;
    private Member member;
}