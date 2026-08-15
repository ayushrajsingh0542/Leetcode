// Last updated: 15/08/2026, 19:48:54
class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<Coupon> validC = new ArrayList<>();
        
        Set<String> validL = Set.of("electronics", "grocery", "pharmacy", "restaurant");
        Map<String, Integer> businessPriority = Map.of(
            "electronics", 0,
            "grocery", 1,
            "pharmacy", 2,
            "restaurant", 3
        );
        
        for (int i = 0; i < code.length; i++) {
            
            if (code[i] == null || code[i].isEmpty() || !code[i].matches("[a-zA-Z0-9_]+"))
                continue;
            
            
            if (!validL.contains(businessLine[i]) || !isActive[i])
                continue;
            
            validC.add(new Coupon(code[i], businessLine[i]));
        }
        
  
        validC.sort((a, b) -> {
            int cmp = Integer.compare(businessPriority.get(a.businessLine), businessPriority.get(b.businessLine));
            return cmp != 0 ? cmp : a.code.compareTo(b.code);
        });

        List<String> result = new ArrayList<>();
        for (Coupon c : validC) {
            result.add(c.code);
        }
        return result;
    }

    
    private static class Coupon {
        String code;
        String businessLine;
        Coupon(String code, String businessLine) {
            this.code = code;
            this.businessLine = businessLine;
        }
    }
}
