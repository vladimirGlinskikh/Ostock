package kz.zhelezyaka.licensing_service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Locale;

@Getter
@Setter
@ToString
public class License {

    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;
}
