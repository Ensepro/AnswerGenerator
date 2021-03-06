package com.ensepro.answer.generator.data;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class JavaResult {

    private final Helper helper;
    private final List<Answer> answers;

}
