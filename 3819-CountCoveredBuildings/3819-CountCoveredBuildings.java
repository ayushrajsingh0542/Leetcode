// Last updated: 15/08/2026, 19:49:34
class Solution {
    public int countCoveredBuildings(int n, int[][] b) {

        HashMap<Integer,Integer> mapx = new HashMap<>();
        HashMap<Integer,Integer> mapy = new HashMap<>();

        for (int[] arr : b) {
            int xi = arr[0];
            int yi = arr[1];
            mapx.put(xi, mapx.getOrDefault(xi, 0) + 1);
            mapy.put(yi, mapy.getOrDefault(yi, 0) + 1);
        }

        Arrays.sort(b, (a, c) -> {
            if (a[0] != c[0]) return Integer.compare(a[0], c[0]);
            return Integer.compare(a[1], c[1]);
        });

        List<int[]> listx = new ArrayList<>();
        int cx = 1;
        int prevx = -1;

        for (int[] arr : b) {
            int xi = arr[0];
            int yi = arr[1];

            int k=mapx.get(xi); 
            if(k<=2) continue; 
            if(cx==1) 
            { 
                cx++;
                 continue; 
                 } 
                 if(cx==k)
                  { 
                    cx=1; 
                    continue;
                     } 
                     listx.add(new int[]{xi,yi});
                      cx++;
        }

        Arrays.sort(b, (a, c) -> {
            if (a[1] != c[1]) return Integer.compare(a[1], c[1]);
            return Integer.compare(a[0], c[0]);
        });

        List<int[]> listy = new ArrayList<>();
        int cy = 1;
        int prevy = -1;

        for (int[] arr : b) {
            int xi = arr[0];
            int yi = arr[1];

           int k=mapy.get(yi); 
           if(k<=2)
            continue; 
            if(cy==1) 
            { 
                cy++;
                 continue; 
                 }
                  if(cy==k) 
                  { cy=1; 
                  continue;
                   } 
                   listy.add(new int[]{xi,yi}); 
                   cy++;
        }

         int ans = 0;

       HashSet<String> set=new HashSet<>();

       for(int [] p : listx)
       {
        set.add(p[0] + "," + p[1]);
       }

       for(int [] p : listy)
       {
        if(set.contains(p[0] + "," + p[1]))
        ans++;
       }
        return ans;
    }
}
