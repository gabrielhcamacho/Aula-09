import java.sql.Time;
import java.util.Date;

public class Movimento {

    private int tipo_mov;
    private Date dt_mov;
    private Time hr_mov;
    private double val_mov;

    public int getTipo_mov() {
        return tipo_mov;
    }

    public Date getDt_mov() {
        return dt_mov;
    }

    public Time getHr_mov() {
        return hr_mov;
    }

    public double getVal_mov() {
        return val_mov;
    }

    public void setTipo_mov(int tipo_mov) {
        this.tipo_mov = tipo_mov;
    }

    public void setDt_mov(Date dt_mov) {
        this.dt_mov = dt_mov;
    }

    public void setHr_mov(Time hr_mov) {
        this.hr_mov = hr_mov;
    }

    public void setVal_mov(double val_mov) {
        this.val_mov = val_mov;
    }
}
