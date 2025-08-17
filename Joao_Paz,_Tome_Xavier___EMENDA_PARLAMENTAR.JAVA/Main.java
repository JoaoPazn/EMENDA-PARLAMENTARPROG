import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
// ---------------------------- EMENDA INDIVIDUAL ---------------------------

        HashMap<String, String> documentosEI1 = new HashMap<>();
        documentosEI1.put("Empenho", "18063994");
        documentosEI1.put("Liquidação", "18063994");
        documentosEI1.put("Pagamento", "15623000");


        HashMap<String, String> conveniosEI1 = new HashMap<>();
        conveniosEI1.put("convenio", "Nenhum registro encontrado");

        EmendaIndividual emendaind1 = new EmendaIndividual(
                "202539130002", 2025, "ANDRE FERREIRA", 18063994 ,
                documentosEI1, conveniosEI1, "Transferências com Finalidade Definida", "ATENCAO PRIMARIA A SAUDE"
        );
        
                HashMap<String, String> documentosEI2 = new HashMap<>();
        documentosEI2.put("Empenho", "36767");
        documentosEI2.put("Liquidação", "25000");
        documentosEI2.put("Pagamento", "5753");


        HashMap<String, String> conveniosEI2 = new HashMap<>();
        conveniosEI2.put("convenio", "Nenhum registro encontrado");

        EmendaIndividual emendaind2 = new EmendaIndividual(
                "202527180008", 2025, "AUGUSTO COUTINHO", 36767 ,
                documentosEI2, conveniosEI2, "Transferências com Finalidade Definida", "DESENVOLVIMENTO REGIONAL E ORDENAMENTO TERRITORIAL"
        );

                HashMap<String, String> documentosEI3 = new HashMap<>();
        documentosEI3.put("Empenho", "3500000");
        documentosEI3.put("Liquidação", "0");
        documentosEI3.put("Pagamento", "0");


        HashMap<String, String> conveniosEI3 = new HashMap<>();
        conveniosEI3.put("convenio", "Nenhum registro encontrado");

        EmendaIndividual emendaind3 = new EmendaIndividual(
                "202539310004", 2025, "CARLOS VERAS", 3500000 ,
                documentosEI3, conveniosEI3, "Transferências com Finalidade Definida", "ATENCAO ESPECIALIZADA A SAUDE"
        );
        

// ---------------------------- EMENDA BANCADA ---------------------------


                HashMap<String, String> documentosEB1 = new HashMap<>();
        documentosEB1.put("Empenho", "20225934");
        documentosEB1.put("Liquidação", "0");
        documentosEB1.put("Pagamento", "0");


        HashMap<String, String> conveniosEB1 = new HashMap<>();
        conveniosEB1.put("ESTADO DE PERNAMBUCO", "Conclusao das obras da Barragem Gatos, no municipio de Lagoa dos Gatos/PE.");
        
        HashMap<String, String> parlamentaresEB1 = new HashMap<>();
        parlamentaresEB1.put("Não Listado", "Não Listado");
        

        EmendaBancada emendaban1 = new EmendaBancada(
                "202171180001", 2021, "BANCADA DE PERNAMBUCO / EMENDA 1", 58115077,
                documentosEB1, conveniosEB1, "BANCADA DE PERNAMBUCO", parlamentaresEB1, "https://www.congressonacional.leg.br/documents/137784508/146970366/Pernambuco.pdf/98575aae-ac1e-4628-b9bc-ea5b754b8bb8"
                , "Não se Aplica"
        );
        
                HashMap<String, String> documentosEB2 = new HashMap<>();
        documentosEB2.put("Empenho", "5240000");
        documentosEB2.put("Liquidação", "4940000");
        documentosEB2.put("Pagamento", "4940000");


        HashMap<String, String> conveniosEB2 = new HashMap<>();
        conveniosEB2.put("convenio", "Nenhum registro encontrado");
        
        HashMap<String, String> parlamentaresEB2 = new HashMap<>();
        parlamentaresEB2.put("Não Listado", "Não Listado");
        

        EmendaBancada emendaban2 = new EmendaBancada(
                "202471180014", 2024, "BANCADA DE PERNAMBUCO / EMENDA 14", 5240000,
                documentosEB2, conveniosEB2, "BANCADA DE PERNAMBUCO", parlamentaresEB2, "https://www.congressonacional.leg.br/documents/137784508/146970306/Pernambuco.pdf/b5e27657-b261-499d-bfd7-4955a77021a0"
                , "Não se Aplica"
        );
        
                HashMap<String, String> documentosEB3 = new HashMap<>();
        documentosEB3.put("Empenho", "12444950");
        documentosEB3.put("Liquidação", "0");
        documentosEB3.put("Pagamento", "0");


        HashMap<String, String> conveniosEB3 = new HashMap<>();
        conveniosEB3.put("convenio", "Nenhum registro encontrado");
        
        HashMap<String, String> parlamentaresEB3 = new HashMap<>();
        parlamentaresEB3.put("Não Listado", "Não Listado");
        

        EmendaBancada emendaban3 = new EmendaBancada(
                "202471180015", 2024, "BANCADA DE PERNAMBUCO / EMENDA 15", 12444950,
                documentosEB3, conveniosEB3, "BANCADA DE PERNAMBUCO", parlamentaresEB3, "https://www.congressonacional.leg.br/documents/137784508/146970306/Pernambuco.pdf/b5e27657-b261-499d-bfd7-4955a77021a0"
                , "Não se Aplica"
        );

// ---------------------------- EMENDA COMISSAO ---------------------------

                HashMap<String, String> documentosEC1 = new HashMap<>();
        documentosEC1.put("Empenho", "690630");
        documentosEC1.put("Liquidação", "690630");
        documentosEC1.put("Pagamento", "690630");


        HashMap<String, String> conveniosEC1 = new HashMap<>();
        conveniosEC1.put("MUNICIPIO DE SANTA JULIANA", "Recapeamento de vias publicas e construcao de passeios no Municipio de Santa Juliana, Estado de Minas gerais.");
        conveniosEC1.put("MUNICIPIO DE IRECE", "Pavimentacao de diversas ruas no municipio de Irece-BA");
        conveniosEC1.put("ESTADO DE RORAIMA", "4 ETAPA DA AMPLIACAO DO SISTEMA DE ESGOTAMENTO SANITARIO DE BOA VISTA");
        // O documento contém 570 convênios, o que pode tornar inviável incluir todos eles dentro do código. Selecionamos os três primeiros, mas todos são importantes. 
        // Ass : Joao Paz e Artur tomé
        
        HashMap<String, String> parlamentaresEC1 = new HashMap<>();
        parlamentaresEC1.put("Não Listado", "Não Listado");
        

        EmendaComissao emendaCom1 = new EmendaComissao(
                "Sem informação", 2016, "RELATOR GERAL", 690630,
                documentosEC1, conveniosEC1, "https://portaldatransparencia.gov.br/emendas/detalhe?codigoFuncao=12&codigoSubfuncao=368&localidadeDoGasto=JABOAT%C3%83O%20DOS%20GUARARAPES%20-%20PE&ano=2016&codigoTipoEmenda=4&ordenarPor=codigoEmpenhoResumido&direcao=asc",
                parlamentaresEC1, "Indisponivel", "Não se Aplica"
        );
        
                HashMap<String, String> documentosEC2 = new HashMap<>();
        documentosEC2.put("Empenho", "3999970");
        documentosEC2.put("Liquidação", "939103");
        documentosEC2.put("Pagamento", "939103");


        HashMap<String, String> conveniosEC2 = new HashMap<>();
        conveniosEC2.put("MUNICIPIO DE CANDIOTA", "Aquisicao de Maquinas e Equipamentos Agricolas.");
        conveniosEC2.put("MUNICIPIO DE PICOS", "Adequacao de estradas vicinais no municipio de Picos PI.");

        HashMap<String, String> parlamentaresEC2 = new HashMap<>();
        parlamentaresEC2.put("MARCELO CASTRO", "Senador");
        

        EmendaComissao emendaCom2 = new EmendaComissao(
                "202350100004", 2023, "COM. AGRICULTURA PEC ABAST D. RURAL / EMENDA 4", 3999970,
                documentosEC2, conveniosEC2, "https://portaldatransparencia.gov.br/emendas/detalhe?codigoEmenda=202350100004&codigoTipoEmenda=4&ordenarPor=codigoEmpenhoResumido&direcao=asc",
                parlamentaresEC2, "Indisponivel", "MARCELO CASTRO"
        );

                HashMap<String, String> documentosEC3 = new HashMap<>();
        documentosEC3.put("Empenho", " 3000000");
        documentosEC3.put("Liquidação", "2300000");
        documentosEC3.put("Pagamento", "2300000");


        HashMap<String, String> conveniosEC3 = new HashMap<>();
        conveniosEC3.put("convenio", "Não Listado");


        HashMap<String, String> parlamentaresEC3 = new HashMap<>();
        parlamentaresEC3.put("VICENTINHO", "Deputado Federal");
        parlamentaresEC3.put("PAULO PAIM", "Senador");
        parlamentaresEC3.put("MAGNO MALTA", "Senador");
        parlamentaresEC3.put("ADAIL FILHO", "Deputado Federal");
        parlamentaresEC3.put("LUIZ FERNANDO VAMPIRO", "Senador");
        parlamentaresEC3.put("DAVI ALCOLUMBRE", "Senador");
        parlamentaresEC3.put("DIEGO GARCIA", "Deputado Federal");        

        EmendaComissao emendaCom3 = new EmendaComissao(
                "202350100004", 2023, "COM. ASSUNTOS SOCIAIS / EMENDA 1", 3000000,
                documentosEC3, conveniosEC3, "https://portaldatransparencia.gov.br/emendas/detalhe?codigoEmenda=202360060001&codigoTipoEmenda=4&ordenarPor=codigoEmpenhoResumido&direcao=asc",
                parlamentaresEC3, "Indisponivel", "VICENTINHO"
        );

// ---------------------------- EMENDA RELATOR ---------------------------

                HashMap<String, String> documentosER1 = new HashMap<>();
        documentosER1.put("Empenho", "123448271");
        documentosER1.put("Liquidação", "123448271");
        documentosER1.put("Pagamento", "123448271");


        HashMap<String, String> conveniosER1 = new HashMap<>();
        conveniosER1.put("ORGANIZACAO PAN-AMERICANA DA SAUDE/ORGANIZACAO MUNDIAL DA SAUDE - OPAS/OMS", "GARANTIR A CONTINUIDADE DA COOPERAÇÃO TÉCNICA ENTRE O MINISTÉRIO E A ORGANIZAÇÃO NO DESENVOLVIMENTO DAS ATIVIDADES DO PROJETO 'PREVENÇÃO E CINTROLE DA DENGUE NO CONTEXTO DA DESTÃO INTEGRADA'");
        conveniosER1.put("MUNICIPIO DE SANTA JULIANA", "Recapeamento de vias publicas e construcao de passeios no Municipio de Santa Juliana, Estado de Minas gerais.");
        conveniosER1.put("MUNICIPIO DE CORIBE", "Implantacao da Praca da Juventude");
        // O documento contém 1551 convênios, Pelo mesmo motivo dito anteriormente, selecionamos apenas 3, Lembrando que todos são importantes igualmente. 
        // Ass : Joao Paz e Artur tomé

  
        EmendaRelator emendaRel1 = new EmendaRelator(
                "Sem informação", 2016, "Sem informação", 123448271,
                documentosER1, conveniosER1,
                "Indisponivel", "Indisponivel","FUNDO MUNICIPAL DE SAUDE DE PENHA"
        );
        
                HashMap<String, String> documentosER2 = new HashMap<>();
        documentosER2.put("Empenho", "8142967.79");
        documentosER2.put("Liquidação", "3974422.50");
        documentosER2.put("Pagamento", "3924468.67");


        HashMap<String, String> conveniosER2 = new HashMap<>();
        conveniosER2.put("convenio", "Nenhum registro encontrado");

  
        EmendaRelator emendaRel2 = new EmendaRelator(
                "202081001490", 2020, "RELATOR GERAL / EMENDA 1490", 8142967.79 ,
                documentosER2, conveniosER2,
                "Indisponivel", "RELATOR GERAL / EMENDA 1490","CONSTRUTORA CASSI LTDA"
        );
        
                HashMap<String, String> documentosER3 = new HashMap<>();
        documentosER3.put("Empenho", "100491.07");
        documentosER3.put("Liquidação", "0");
        documentosER3.put("Pagamento", "0");


        HashMap<String, String> conveniosER3 = new HashMap<>();
        conveniosER3.put("ORGANIZACAO PAN-AMERICANA DA SAUDE/ORGANIZACAO MUNDIAL DA SAUDE - OPAS/OMS", "GARANTIR A CONTINUIDADE DA COOPERAÇÃO TÉCNICA ENTRE O MINISTÉRIO E A ORGANIZAÇÃO NO DESENVOLVIMENTO DAS ATIVIDADES DO PROJETO 'PREVENÇÃO E CINTROLE DA DENGUE NO CONTEXTO DA DESTÃO INTEGRADA'");
        conveniosER3.put("MUNICIPIO DE SANTA JULIANA", "Recapeamento de vias publicas e construcao de passeios no Municipio de Santa Juliana, Estado de Minas gerais.");
        conveniosER3.put("MUNICIPIO DE CORIBE", "Implantacao da Praca da Juventude");

  
        EmendaRelator emendaRel3 = new EmendaRelator(
                "Sem informação", 2019, "Sem informação", 100491.07 ,
                documentosER3, conveniosER3,
                "Indisponivel", "Sem informação","MUNICIPIO DE MATA DE SAO JOAO"
        );


// ---------------------------- RETORNO EMENDA INDIVIDUAL ---------------------------
        System.out.println(emendaind1.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaind1.getValorPorFase("Empenho")));
        
        System.out.println(emendaind2.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaind2.getValorPorFase("Empenho")));
        
        System.out.println(emendaind3.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaind3.getValorPorFase("Empenho")) + "\n");
        
// ---------------------------- RETORNO EMENDA BANCADA ---------------------------

        System.out.println(emendaban1.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaban1.getValorPorFase("Empenho")));
        
        System.out.println(emendaban2.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaban2.getValorPorFase("Empenho")));
        
        System.out.println(emendaban3.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaban3.getValorPorFase("Empenho")) + "\n");
        
// ---------------------------- RETORNO EMENDA COMISSAO ---------------------------

        System.out.println(emendaCom1.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaCom1.getValorPorFase("Empenho")));
        
        System.out.println(emendaCom2.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaCom2.getValorPorFase("Empenho")));
        
        System.out.println(emendaCom3.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaCom3.getValorPorFase("Empenho")) + "\n");

// ---------------------------- RETORNO EMENDA RELATOR ---------------------------

        System.out.println(emendaRel1.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaRel1.getValorPorFase("Empenho")));
        
        System.out.println(emendaRel2.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaRel2.getValorPorFase("Empenho")));
        
        System.out.println(emendaRel3.getDados());        
        System.out.println("Valor empenho: " + String.format("%.0f", emendaRel3.getValorPorFase("Empenho")) + "\n");
    }
}

// https://www.online-ide.com/2miatFslzo
// Link para o IDE online onde fizemos o código