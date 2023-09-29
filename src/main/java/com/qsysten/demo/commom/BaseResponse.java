package com.qsysten.demo.commom;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
public class BaseResponse <T> {


    private Trace trace;
    private Status status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T payload;


    public BaseResponse() {
        super();
        trace = new Trace();
        status = new Status();
    }


    public BaseResponse<BaseResponseList<T>> okList(List<T> lista) {
        BaseResponseList<T> respObtainList = new BaseResponseList<>(lista);
        BaseResponse<BaseResponseList<T>> BaseResponse = new BaseResponse().ok(respObtainList);
        return BaseResponse;
    }

    public BaseResponse <T> ok (T payload) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setPayload(payload);
        response.getStatus().setSuccess(Boolean.TRUE);
        return response;
    }

    @Getter
    @Setter
    @ToString
    public static class Trace {
        private String traceId;
    }


    @Getter
    @Setter
    @ToString
    public static class Status {
        private Boolean success;

        private Error error;

        public Status() {
            super();
            error = new Error();
        }

        public static class Error {

            private String code;
            private String httpCode;
            private List<String> messages;

            public Error() {
                super();
                messages = new ArrayList<>();
            }

        }
    }
}
