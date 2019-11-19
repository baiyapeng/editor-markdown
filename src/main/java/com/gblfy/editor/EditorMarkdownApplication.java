package com.gblfy.editor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * SpringBoot 启动入口
 */
@SpringBootApplication
@EnableJpaAuditing
public class EditorMarkdownApplication {

	public static void main(String[] args) {
		SpringApplication.run(EditorMarkdownApplication.class, args);
	}
}
