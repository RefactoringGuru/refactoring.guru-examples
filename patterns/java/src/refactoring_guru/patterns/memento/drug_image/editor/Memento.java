package refactoring_guru.patterns.memento.drug_image.editor;

import java.util.List;

public class Memento {
    List backup;

    public void setBackup(List list) {
        backup = list;
    }

    public List restore() {
        return backup;
    }
}
