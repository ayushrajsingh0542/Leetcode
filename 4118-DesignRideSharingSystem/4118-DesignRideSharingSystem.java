// Last updated: 15/08/2026, 19:48:07
    class RideSharingSystem {
    
        static class Node
            {
                int id;
                Node prev,next;
                Node(int id)
                {
                    this.id=id;
                }
            }
        Node rh,rt,dh,dt;
    
        public RideSharingSystem() {
            
        }
        
        public void addRider(int riderId) {
    Node n = new Node(riderId);
    if (rh == null) {
        rh = rt = n;
    } else {
        rt.next = n;
        n.prev = rt;
        rt = n;
    }
}

        
        public void addDriver(int driverId) {
            Node n=new Node(driverId);
            if(dh==null)
                dh=dt=n;
            else
            {
                dt.next=n;
                n.prev=dt;
                dt=n;
            }
        }
        
        public int[] matchDriverWithRider() {
            if(rh==null || dh==null)
                return new int[]{-1,-1};
    
             Node r=rh;
            Node d=dh;
            rh=rh.next;
            if(rh!=null)
                rh.prev=null;
            else
                rt=null;
    
            dh=dh.next;
            if(dh!=null)
                dh.prev=null;
            else
                dt=null;
    
            return new int[]{d.id,r.id};
        }
        
        public void cancelRider(int riderId) {
            Node c=rh;
            while(c!=null)
                {
                    if(c.id==riderId)
                    {
                        if(c.prev!=null)
                            c.prev.next=c.next;
                        else
                            rh=c.next;
    
                        if(c.next!=null)
                            c.next.prev=c.prev;
                        else
                            rt=c.prev;
                        return;
                    }
                    c=c.next;
                }
        }
    }
    
    /**
     * Your RideSharingSystem object will be instantiated and called as such:
     * RideSharingSystem obj = new RideSharingSystem();
     * obj.addRider(riderId);
     * obj.addDriver(driverId);
     * int[] param_3 = obj.matchDriverWithRider();
     * obj.cancelRider(riderId);
     */