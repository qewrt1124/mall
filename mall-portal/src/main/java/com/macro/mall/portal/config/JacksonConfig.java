package com.macro.mall.portal.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;


/**
 * Jackson 관련 구성
 * null을 반환하지 않는 JSON 필드 구성
 * Created by macro on 2018/8/2.
 */
@Configuration
public class JacksonConfig {
    @Bean
    @Primary
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();

        // 이 메서드로 매퍼 개체를 설정하면 serialize된 모든 개체가 이 규칙에 따라 serialize됩니다
        // Include.ALWAYS 기본값
        // Include.NON_DEFAULT 속성은 기본값으로 serialize되지 않습니다
        // Include.NON_EMPTY 비어 있는("") 또는 NULL인 속성은 직렬화되지 않으며 반환된 json에는 이 필드가 없습니다
        // Include.NON_NULL NULL 특성이 있는 필드는 직렬화되지 않습니다
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // 필드가 유지되고 null 값이 ""로 변경됩니다.
//        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>()
//        {
//            @Override
//            public void serialize(Object o, JsonGenerator jsonGenerator,
//                                  SerializerProvider serializerProvider)
//                    throws IOException, JsonProcessingException
//            {
//                jsonGenerator.writeString("");
//            }
//        });
        return objectMapper;
    }
}
