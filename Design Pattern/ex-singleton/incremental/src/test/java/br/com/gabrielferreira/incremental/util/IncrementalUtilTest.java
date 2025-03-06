package br.com.gabrielferreira.incremental.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IncrementalUtilTest {

    private IncrementalUtil incrementalUtil;

    @BeforeEach
    public void beforeEach() {
        incrementalUtil = new IncrementalUtil();
    }

    @Test
    @DisplayName("Deve gerar o incremental")
    void deveGerarIncremental() {
        incrementalUtil = incrementalUtil.getInstance();

        Assertions.assertNotNull(incrementalUtil);
        Assertions.assertEquals(1, incrementalUtil.getNumero());
    }
}
