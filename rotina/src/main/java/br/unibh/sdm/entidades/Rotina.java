package br.unibh.sdm.entidades;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "rotina")
public class Rotina {
    private String id;
    private String hora;
    private String diaDaSemana;
    private Date data;

    @DynamoDBAutoGeneratedKey
    @DynamoDBHashKey
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @DynamoDBAttribute
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @DynamoDBAttribute
    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    @DynamoDBAttribute
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Rotina() {
    }

    public Rotina(String id, String hora, String diaDaSemana, Date data) {
        this.id = id;
        this.hora = hora;
        this.diaDaSemana = diaDaSemana;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Rotina [id=" + id + ", hora=" + hora + ", diaDaSemana=" + diaDaSemana + ", data=" + data + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((hora == null) ? 0 : hora.hashCode());
        result = prime * result + ((diaDaSemana == null) ? 0 : diaDaSemana.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rotina other = (Rotina) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (hora == null) {
            if (other.hora != null)
                return false;
        } else if (!hora.equals(other.hora))
            return false;
        if (diaDaSemana == null) {
            if (other.diaDaSemana != null)
                return false;
        } else if (!diaDaSemana.equals(other.diaDaSemana))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

}
