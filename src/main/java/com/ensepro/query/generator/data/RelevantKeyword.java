package com.ensepro.query.generator.data;

import com.ensepro.query.generator.domain.GrammarClass;
import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Getter
@Builder
public class RelevantKeyword {

    private final String keyword;
    private final Double weight;
    private final GrammarClass grammarClass;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelevantKeyword that = (RelevantKeyword) o;
        return Objects.equals(keyword, that.keyword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword);
    }
}
