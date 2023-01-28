package AluraSolid.interfaces;

import AluraSolid.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
