package com.marth.myblog.shiro;

import lombok.Data;

import java.io.Serializable;

@Data

public class AccountProfile implements Serializable {

    private String userId;

    private String userName;

    private String avatar;

    private String email;

}
