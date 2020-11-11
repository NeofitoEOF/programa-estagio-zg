package br.zgsolucoes.programa.estagio.calculadora;

import groovy.transform.CompileStatic;

import java.math.BigDecimal;

@CompileStatic
class Calculadora {
    BigDecimal somar(final BigDecimal n1, final BigDecimal n2) {
        return n1 + n2
    }
    BigDecimal subtrair(final BigDecimal n1, final BigDecimal n2) {
        return n1 - n2
    }
    BigDecimal multiplicacao(final BigDecimal n1, final BigDecimal n2) {
        return n1 * n2
    }
    BigDecimal divisao(final BigDecimal n1, final BigDecimal n2) {
        return n1 / n2
    }
    BigDecimal delta(final BigDecimal a, final BigDecimal b, final BigDecimal c) {
        return (b*b) -(4 * a * c)
    }
    BigDecimal calcularRaizPositiva(final BigDecimal a, final BigDecimal b, final BigDecimal c) {
       final BigDecimal delta = delta(a,b,c)
        return (b*-1 + Math.sqrt(delta.toDouble())) / 2*a
    }
    BigDecimal calcularRaizNegativa(final BigDecimal a, final BigDecimal b, final BigDecimal c) {
        final BigDecimal delta = delta(a,b,c)
        return (b*-1 - Math.sqrt(delta.toDouble())) / 2*a
    }
}
