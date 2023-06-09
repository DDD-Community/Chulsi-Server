package com.ddd.chulsi.infrastructure.oauth;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OauthInfo {

    public record KakaoInfoResponse(
        @JsonProperty("token_type")
        String tokenType,

        @JsonProperty("access_token")
        String accessToken,

        @JsonProperty("expires_in")
        Integer expiresIn,

        @JsonProperty("refresh_token")
        String refreshToken,

        @JsonProperty("refresh_token_expires_in")
        Integer refreshTokenExpiresIn
    ) {

    }

    public record KakaoLogoutResponse(
        @JsonProperty("id")
        Long id
    ) {

    }

    public record KakaoUserMe(
        @JsonProperty("id")
        Long id,

        @JsonProperty("kakao_account")
        KakaoAccount kakaoAccount
    ) {
        public record KakaoAccount(
            @JsonProperty("profile")
            KakaoProfile kakaoProfile
        ) { }

        public record KakaoProfile(
            @JsonProperty("nickname")
            String nickname
        ) { }
    }
}
