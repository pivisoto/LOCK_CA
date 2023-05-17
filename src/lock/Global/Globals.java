package lock.Global;

public class Globals {

    private static Globals inst;
    private int idUsuario;

    private Globals(int usr_id) {
        setIdUsuario(usr_id);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;

    }

    public static Globals getInstance(int usr_id) {
        if (inst == null) {
            inst = new Globals(usr_id);
        }
        return inst;
    }
}
