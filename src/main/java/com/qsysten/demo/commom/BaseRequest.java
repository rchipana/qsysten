package com.qsysten.demo.commom;





import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class BaseRequest<T> {
    private Trace trace;

    @NotNull(message = "Field payload es required")
    @Valid
    private T payload;

    public BaseRequest() {
        super();

    }

    @Getter
    @Setter
    public static class Trace {

        @NotNull(message = "Field traceId es required")



        private String traceId;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "trace=" + trace +
                ", payload=" + payload +
                '}';
    }
}
