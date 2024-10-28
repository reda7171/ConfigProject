package com.cc.customconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguration {
	
	private String url;
	private String username;
	private String key;

	
}
