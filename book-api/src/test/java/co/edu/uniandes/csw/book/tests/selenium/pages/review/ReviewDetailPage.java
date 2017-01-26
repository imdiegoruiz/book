/*
The MIT License (MIT)

Copyright (c) 2015 Los Andes University

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.book.tests.selenium.pages.review;

import co.edu.uniandes.csw.book.dtos.minimum.ReviewDTO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewDetailPage {

    @FindBy(id = "delete-review")
    private WebElement deleteBtn;

    @FindBy(id = "edit-review")
    private WebElement editBtn;

    @FindBy(id = "list-review")
    private WebElement listBtn;

    
    @FindBy(id = "name")
    private WebElement name;
    @FindBy(id = "source")
    private WebElement source;
    @FindBy(id = "description")
    private WebElement description;

    public void list() {
        listBtn.click();
    }

    public void edit() {
        editBtn.click();
    }

    public void delete() {
        deleteBtn.click();
    }

    public ReviewDTO getData() {
        ReviewDTO review = new ReviewDTO();        
        review.setName(this.name.getText());        
        review.setSource(this.source.getText());        
        review.setDescription(this.description.getText());        
        return review;
    }
}