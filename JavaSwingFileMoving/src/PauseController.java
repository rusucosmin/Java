/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rusucosmin
 */
public class PauseController {
    private boolean isPause = false;
    public synchronized void checkState() {
        while(isPause) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.err.println("Exception when trying to wait() this Object");
            }
        }
    }
    public synchronized void flipState() {
        isPause ^= true;
        notify();
    }
    public synchronized void refresh() {
        isPause = false;
        notify();
    }
}
