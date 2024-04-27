package com.example.query.param;

import lombok.*;

//@Data
//@AllArgsConstructor
@Getter
public class ApplicationQueryParam {
    public ApplicationQueryParam(boolean isBad){
        this.isBad = isBad;
    }
//    public ApplicationQueryParam(){
//        System.out.println("ApplicationQueryParamのコンストラクタ");
//    }
//    private boolean good;
//    @Setter(AccessLevel.NONE)
//    @Getter(AccessLevel.NONE)
    private boolean isBad = false;

//    public boolean getIsBad(){
//        return isBad;
//    }
//    public void setIsBad(boolean isBad){
//        this.isBad = isBad;
//    }
//    private Boolean best;
//    private Boolean isWorst;
}
