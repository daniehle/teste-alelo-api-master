package br.com.daniele.todoapp.model.enums;

public enum StatusTarefa {
    REALIZAR, EXECUTANDO, PRONTO;

    public static StatusTarefa convert(String status) {

        if (status == null) {
            return null;
        }

        if (status.equalsIgnoreCase("todo")) {
            return REALIZAR;
        }

        if (status.equalsIgnoreCase("doing")) {
            return EXECUTANDO;
        }

        if (status.equalsIgnoreCase("done")) {
            return PRONTO;
        }

        return REALIZAR;
    }
}
