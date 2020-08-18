package com.cos.logtestex.repository;

import com.cos.logtestex.model.User;
import com.cos.logtestex.model.dto.ReqJoinDto;

public interface UserRepository {
	int save(ReqJoinDto dto);
	User findByUsernameAndPassword(ReqLoginDto dto);
}
