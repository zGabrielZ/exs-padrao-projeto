package br.com.gabrielferreira.email.xml;

import br.com.gabrielferreira.email.exception.ContatoXMLException;
import br.com.gabrielferreira.email.model.Contato;
import br.com.gabrielferreira.email.xml.model.ContatoListXML;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ContatoXML {

    private final List<Contato> contatos = new ArrayList<>();
    
    public ContatoXML(String... nomesArquivos) {
        try {
            for (String nomeArquivo : nomesArquivos) {
                System.out.println("Carregando arquivo: " + nomeArquivo);

                ClassLoader classLoader = ContatoXML.class.getClassLoader();
                InputStream inputStream = classLoader.getResourceAsStream(nomeArquivo);

                JAXBContext context = JAXBContext.newInstance(ContatoListXML.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();

                ContatoListXML contatoListXML = (ContatoListXML) unmarshaller.unmarshal(inputStream);
                if (existeContatos(contatoListXML)) {
                    contatoListXML.getContatos().forEach(contato -> this.contatos.add(new Contato(contato.getNome(), contato.getEmail(), contato.isBlackList())));
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao recuperar arquivo XML de contato: " + e.getMessage());
            throw new ContatoXMLException("Erro ao recuperar arquivo XML de contato");
        }
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public boolean existeContatos(ContatoListXML contatoListsXML) {
        return contatoListsXML != null && (contatoListsXML.getContatos() == null || !contatoListsXML.getContatos().isEmpty());
    }
}
