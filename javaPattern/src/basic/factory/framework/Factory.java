package basic.factory.framework;


/**
* Factory 클래스는 Tempalate Method 패턴이 사용되고 있다.
* 추상 메소드 createProduct에서는 '제품을 만들고',
* 만든 제품을 추상 메소드 registerProduct에서 '등록'
* '만들고', '등록'의 구현은 하위 클래스에서 수행
* 이 framework에서 공장이란 'create'메소드에서 Product의 인스턴스를 생성하는 것
* 구체적은 구현 내용은 Factory Method 패턴을 적용한 프로그램에 따라 다르다.
* Factory Method 패턴에서 인스턴스를 생성할 때 Template Method 패턴을 사용
*/
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}

