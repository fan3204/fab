package design.bridge.way2;

/**
 * TODO
 *
 * @author fab
 * @date 2021/5/10
 */
public class SevereNotification extends Notification
{
    public SevereNotification(MsgSender msgSender)
    {
        super(msgSender);
    }

    @Override
    public void notify(String message)
    {
        msgSender.send(message);
    }
}
