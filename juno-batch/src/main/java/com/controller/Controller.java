package com.controller;

import com.dto.Admin;
import com.mapper.AdminMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class Controller {

	private AdminMapper mapper;

	public Controller(AdminMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("/api")
	public void get() {
		List<Admin> admin = mapper.select();
		log.error(admin.toString());
	}
}
