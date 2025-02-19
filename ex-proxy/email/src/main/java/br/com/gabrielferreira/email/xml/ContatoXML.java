package br.com.gabrielferreira.email.xml;

import br.com.gabrielferreira.email.exception.ContatoXMLException;
import br.com.gabrielferreira.email.model.ContatoList;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.InputStream;

public class ContatoXML {

    private final ContatoList contatoList = new ContatoList();
    
    public ContatoXML(String... nomesArquivos) {
        try {
            for (String nomeArquivo : nomesArquivos) {
                System.out.println("Carregando arquivo: " + nomeArquivo);

                ClassLoader classLoader = ContatoXML.class.getClassLoader();
                InputStream inputStream = classLoader.getResourceAsStream(nomeArquivo);

                JAXBContext context = JAXBContext.newInstance(ContatoList.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();

                ContatoList contatoList1 = (ContatoList) unmarshaller.unmarshal(inputStream);
                if (existeContatos(contatoList1)) {
                    contatoList1.getContatos().forEach(contato -> this.contatoList.getContatos().add(contato));
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao recuperar arquivo XML de contato: " + e.getMessage());
            throw new ContatoXMLException("Erro ao recuperar arquivo XML de contato");
        }
    }

    public ContatoList getContatoList() {
        return contatoList;
    }

    public boolean existeContatos(ContatoList contatoLists) {
        return contatoLists != null && (contatoLists.getContatos() == null || !contatoLists.getContatos().isEmpty());
    }
}
