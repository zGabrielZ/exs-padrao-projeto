package br.com.gabrielferreira.pedido.xml;

import br.com.gabrielferreira.pedido.exception.PedidoXMLException;
import br.com.gabrielferreira.pedido.model.ItemPedido;
import br.com.gabrielferreira.pedido.model.Pedido;
import br.com.gabrielferreira.pedido.xml.model.PedidoXMLList;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PedidoXML {

    private final Pedido pedido;

    public PedidoXML(String nomeArquivo) {
        try {
            System.out.println("Carregando arquivo: " + nomeArquivo);

            ClassLoader classLoader = PedidoXML.class.getClassLoader();
            InputStream inputStream = classLoader.getResourceAsStream(nomeArquivo);

            JAXBContext context = JAXBContext.newInstance(PedidoXMLList.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            List<ItemPedido> itens = new ArrayList<>();
            PedidoXMLList pedidoXMLList = (PedidoXMLList) unmarshaller.unmarshal(inputStream);
            if (existePedidos(pedidoXMLList)) {
                pedidoXMLList.getPedidos().forEach(pedidoXML -> itens.add(new ItemPedido(pedidoXML.getDescricao(), pedidoXML.getValor())));
            }
            this.pedido = new Pedido(itens);
        } catch (Exception e) {
            System.out.println("Erro ao recuperar arquivo XML de pedido: " + e.getMessage());
            throw new PedidoXMLException("Erro ao recuperar arquivo XML de pedido");
        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public boolean existePedidos(PedidoXMLList pedidoXMLList) {
        return pedidoXMLList != null && (pedidoXMLList.getPedidos() == null || !pedidoXMLList.getPedidos().isEmpty());
    }
}
