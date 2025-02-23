package br.com.gabrielferreira.pedido.xml;

import br.com.gabrielferreira.pedido.exception.PedidoXMLException;
import br.com.gabrielferreira.pedido.model.PedidoList;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.InputStream;

public class PedidoXML {

    private final PedidoList pedidoList;

    public PedidoXML(String nomeArquivo) {
        try {
            System.out.println("Carregando arquivo: " + nomeArquivo);

            ClassLoader classLoader = PedidoXML.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(nomeArquivo);

            JAXBContext context = JAXBContext.newInstance(PedidoList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            this.pedidoList = (PedidoList) unmarshaller.unmarshal(inputStream);
        } catch (Exception e) {
            System.out.println("Erro ao recuperar arquivo XML de pedido: " + e.getMessage());
            throw new PedidoXMLException("Erro ao recuperar arquivo XML de pedido");
        }
    }

    public PedidoList getPedidoList() {
        return pedidoList;
    }
}
