import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;

public class FillLayoutComposite extends Composite {

    public FillLayoutComposite(Composite parent) {
        super(parent, SWT.NONE);

        FillLayout layout = new FillLayout( SWT.VERTICAL);
        setLayout(layout);
        for (int i = 0; i < 8; ++i) {
            Button button = new Button(this, SWT.NONE);
            button.setText("Sample Text");
        }
    }
}
