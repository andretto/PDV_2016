package br.com.trainning.pdv_2016.domain.model;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.AutoIncrement;
import se.emilsjolander.sprinkles.annotations.Column;
import se.emilsjolander.sprinkles.annotations.Key;
import se.emilsjolander.sprinkles.annotations.Table;

/**
 * Created by Marcelo on 12/03/2016.
 */
@Table("item")
public class Item extends Model {

    @Key
    @AutoIncrement
    @Column("Id")
    private long id;
    @Column("id_compra")
    private long idCompraompra;
    @Column("id_produto")
    private String idProduto;
    @Column("quantidade")
    private int quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCompraompra() {
        return idCompraompra;
    }

    public void setIdCompraompra(long idCompraompra) {
        this.idCompraompra = idCompraompra;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }





}
