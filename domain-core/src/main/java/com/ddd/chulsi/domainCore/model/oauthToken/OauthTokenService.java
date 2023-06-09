package com.ddd.chulsi.domainCore.model.oauthToken;

import com.ddd.chulsi.domainCore.model.shared.DefinedCode;

public interface OauthTokenService {

    void save(OauthToken oauthToken);

    void delete(OauthToken oauthToken);

    OauthToken findByOauthTypeAndOauthId(DefinedCode oauthType, Long oauthId);

}
