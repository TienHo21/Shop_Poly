package poly.edu.shop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/*dịch vụ dùng để thao tác và lưu trữ với Files*/
@ConfigurationProperties("storage")
@Data
public class StorageProperties {
	private String location;
}
