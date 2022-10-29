import java.util.Date;

public class Conta_Comum {
    protected long nro_conta;
    protected Date dt_abertura;
    protected Date dt_encerramento;
    protected int situacao = 1;
    protected int senha;
    protected double saldo = 0;

    public long getNro_conta() {
        return nro_conta;
    }

    public void setNro_conta(long nro_conta) {
        this.nro_conta = nro_conta;
    }

    public Date getDt_abertura() {
        return dt_abertura;
    }

    public void setDt_abertura(Date dt_abertura) {
        this.dt_abertura = dt_abertura;
    }

    public Date getDt_encerramento() {
        return dt_encerramento;
    }

    public void setDt_encerramento(Date dt_encerramento) {
        this.dt_encerramento = dt_encerramento;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
