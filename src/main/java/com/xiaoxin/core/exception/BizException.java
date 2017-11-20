package com.xiaoxin.core.exception;

import lombok.*;

/**
 * @author zhangyongxin
 * @date 2017/11/17 下午5:35
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BizException extends Exception{

    @NonNull
    private String message;

    private String msgId;


}
