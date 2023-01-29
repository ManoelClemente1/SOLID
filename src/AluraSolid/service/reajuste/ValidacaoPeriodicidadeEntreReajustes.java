package AluraSolid.service.reajuste;

import AluraSolid.Exceptions.ValidacaoException;
import AluraSolid.interfaces.ValidacaoReajuste;
import AluraSolid.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {

    public void validar (Funcionario funcionario, BigDecimal aumento){
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();

        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste,dataAtual);

        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes devem ser no minimo 6 meses!");
        }

    }
}
