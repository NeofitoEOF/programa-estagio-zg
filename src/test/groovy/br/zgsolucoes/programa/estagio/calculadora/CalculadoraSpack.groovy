package br.zgsolucoes.programa.estagio.calculadora
import groovy.transform.CompileStatic
import spock.lang.Specification
import spock.lang.Unroll

@CompileStatic
class CalculadoraSpec extends Specification {
    @Unroll
    void "teste realizar soma #numero1 com #numero2 a saida esperada e #saida"() {
        given: 'Tenho uma calculadora limpa'
        final Calculadora calculadora = new Calculadora()

        and: 'Tenho um número'
        final BigDecimal n1 = new BigDecimal(numero1)

        and: 'Tenho outro número'
        final BigDecimal n2 = new BigDecimal(numero2)

        when: 'Pede para somar'
        final BigDecimal resposta = calculadora.somar(n1, n2)

        then: 'A resposta deve ser a esperada'
        resposta == saida

        where:
        numero1 | numero2  | saida
        1       |  1       |  2
        2       |  2       |  4

    }

    @Unroll
    void "teste realizar subtrair #numero1 com #numero2 a saida esperada e #saida"() {
        given: 'Tenho uma calculadora limpa'
        final Calculadora calculadora = new Calculadora()

        and: 'Tenho um número'
        final BigDecimal n1 = new BigDecimal(numero1)

        and: 'Tenho outro número'
        final BigDecimal n2 = new BigDecimal(numero2)

        when: 'Pede para somar'
        final BigDecimal resposta = calculadora.subtrair(n1, n2)

        then: 'A resposta deve ser a esperada'
        resposta == saida

        where:
        numero1 | numero2  | saida
        1       |  1       |  0
        2       |  2       |  0
        2       |  1       |  1

    }
    @Unroll
    void "teste realizar multiplicacao #numero1 com #numero2 a saida esperada e #saida"() {
        given: 'Tenho uma calculadora limpa'
        final Calculadora calculadora = new Calculadora()

        and: 'Tenho um número'
        final BigDecimal n1 = new BigDecimal(numero1)

        and: 'Tenho outro número'
        final BigDecimal n2 = new BigDecimal(numero2)

        when: 'Pede para somar'
        final BigDecimal resposta = calculadora.multiplicacao(n1, n2)

        then: 'A resposta deve ser a esperada'
        resposta == saida

        where:
        numero1 | numero2  | saida
        1       |  1       |  1
        2       |  2       |  4
        2       |  1       |  2

    }
    @Unroll
    void "teste realizar divisao #numero1 com #numero2 a saida esperada e #saida"() {
        given: 'Tenho uma calculadora limpa'
        final Calculadora calculadora = new Calculadora()

        and: 'Tenho um número'
        final BigDecimal n1 = new BigDecimal(numero1)

        and: 'Tenho outro número'
        final BigDecimal n2 = new BigDecimal(numero2)

        when: 'Pede para somar'
        final BigDecimal resposta = calculadora.divisao(n1, n2)

        then: 'A resposta deve ser a esperada'
        resposta == saida

        where:
        numero1 | numero2  | saida
        1       |  1       |  1
        2       |  2       |  1
        2       |  1       |  2

    }

    @Unroll
    void "Calcular o delta"() {
        given: 'Tenho uma calculadora limpa'
        final Calculadora calculadora = new Calculadora()

        final BigDecimal a = new BigDecimal(numero1)
        final BigDecimal b = new BigDecimal(numero2)
        final BigDecimal c = new BigDecimal(numero3)
        final BigDecimal resposta = calculadora.delta(a, b, c)
        resposta == saida

        where:
        numero1 | numero2  | numero3 | saida
        1       |  2       |  0      | 4

    }

    void "Calcular raiz a primeira raiz "() {
        given: 'Tenho uma calculadora limpa'
        final Calculadora calculadora = new Calculadora()

        final BigDecimal a = new BigDecimal(numero1)
        final BigDecimal b = new BigDecimal(numero2)
        final BigDecimal c = new BigDecimal(numero3)
        final BigDecimal resposta = calculadora.calcularRaizPositiva(a, b, c)
        resposta == saida

        where:
        numero1 | numero2  | numero3 | saida
        1       |  2       |  0      | 0

    }

    void "Calcular raiz a segunda raiz "() {
        given: 'Tenho uma calculadora limpa'
        final Calculadora calculadora = new Calculadora()

        final BigDecimal a = new BigDecimal(numero1)
        final BigDecimal b = new BigDecimal(numero2)
        final BigDecimal c = new BigDecimal(numero3)
        final BigDecimal resposta = calculadora.calcularRaizNegativa(a, b, c)
        resposta == saida

        where:
        numero1 | numero2  | numero3 | saida
        1       |  2       |  0      | -2
    }
}
