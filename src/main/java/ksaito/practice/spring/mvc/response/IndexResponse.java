package ksaito.practice.spring.mvc.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class IndexResponse {
  private String inputText;
}
