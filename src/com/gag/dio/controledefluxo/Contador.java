package com.gag.dio.controledefluxo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contador {
    private static final Logger logger = Logger.getLogger(Contador.class.getName());
    public static void main( String[] args ) {
        logger.setLevel( Level.INFO );
        Scanner terminal = new Scanner(System.in);
        logger.info("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        logger.info("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException( "O segundo parâmetro deve ser maior que o primeiro" );
        }
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            logger.info("Imprimindo o número "+ i);
        }
    }
}