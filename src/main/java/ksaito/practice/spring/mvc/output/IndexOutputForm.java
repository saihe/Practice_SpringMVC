package ksaito.practice.spring.mvc.output;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class IndexOutputForm {
  private String inputText;
}
